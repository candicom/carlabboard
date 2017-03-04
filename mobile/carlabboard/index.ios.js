/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View,
  TouchableHighlight,
  Alert,
  BackAndroid,
  Navigator
} from 'react-native';

import Board from './Board';

class Carlabboard extends Component {

  _navigator;

  constructor(props) {
    super(props);

  }

  componentDidMount() {
    BackAndroid.addEventListener('hardwareBackPress', this._handleBackAction);
  }

  componentWillUnmount() {
    BackAndroid.removeEventListener('hardwareBackPress', this._handleBackAction);
  }

  render() {

    const self = this;
    return (
      <Navigator
        ref={(nav) => {
          if (nav) {
            self._navigator = nav;
          }
        }}
        initialRoute={{ component: Board, componentClassName: 'Board', passProps: { title: 'carlab board' }, type: 'Normal' }}
        renderScene={(route, navigator) => {
          return <route.component navigator={navigator} {...route.passProps} />;
        }}
        navigationBar={
         <Navigator.NavigationBar
           routeMapper={{
             LeftButton: (route, navigator, index, navState) => {
              if (index > 0) {
                return (
                  <TouchableHighlight
                    style={{flex: 1, alignItems: 'center', justifyContent: 'center', paddingLeft: 10, paddingRight: 10}}
                    onPress={() => { navigator.pop(); }}>
                    <Text style={{fontSize: 24, color: 'white'}}>{'<'}</Text>
                  </TouchableHighlight>
                );
              } else {
                return null;
              }
             },
             RightButton: () => {
               return null;
             },
             Title: (route, navigator, index, navState) => {
               return (
                    <View style={{flex: 1, alignItems: 'center', justifyContent: 'center'}}>
                      <Text style={{fontSize: 16, color: 'white', fontWeight: 'bold', textAlign: 'center'}}>{route.passProps.title.toUpperCase()}</Text>
                    </View>
                );
             },
           }}
           style={{backgroundColor: '#9dadff'}}
         />
        }
        configureScene={(route, routeStack) => {
          if (route.type === 'Modal') {
            return { ...Navigator.SceneConfigs.FloatFromBottom, gestures: {} };
          } else {
            return { ...Navigator.SceneConfigs.PushFromRight, gestures: {} };
          }
        }}
      />
    );
  }

  _handleBackAction = () => {
    const self = this;
    const navigator = self._navigator;
    if (navigator && navigator.getCurrentRoutes().length > 1) {
      navigator.pop();
      return true;
    }
    Alert.alert(
      'Alert',
      'Are you sure to exit?',
      [
        {text: 'Cancel', onPress: () => {}},
        {text: 'OK', onPress: () => BackAndroid.exitApp()},
      ]
    );
    return true;
  };


}


AppRegistry.registerComponent('carlabboard', () => Carlabboard);
