import React, { Component, PropTypes } from 'react';
import { Platform, View, Text, Image, TouchableHighlight, ScrollView, ListView, NativeModules } from 'react-native';
const { StatusBarManager } = NativeModules;
import * as axios from 'axios';

const ACTION_BAR_HEIGHT = Platform.OS === 'android' ? 56 : 45;
const STATUS_BAR_HEIGHT = Platform.OS === 'ios' ? 20 : StatusBarManager.HEIGHT;

const api = axios.create({
  baseURL: 'http://localhost:8080/api/',
  // baseURL: 'http://138.197.36.144:8080/api/',
  timeout: 50000,
  headers: {'Content-Type': 'application/json', Accept: 'application/json,text/plain,*/*'},
});

import BoardDetail from './BoardDetail';

class Board extends Component {

  constructor(props) {
    super(props);

    const ds = new ListView.DataSource({rowHasChanged: (r1, r2) => r1.id !== r2.id});

    this.state = {
      ds: ds,
      boardsData: [],
      boardsDataSource: ds.cloneWithRows([])
    };
  }

  componentDidMount() {
    const self = this;
    self._refreshBoards();
  }

  shouldComponentUpdate(nextProps, nextState) {
    let shouldUpdate = false;
    if (nextState && this.state.boardsDataSource !== nextState.boardsDataSource) {
      shouldUpdate = true;
    }
    return shouldUpdate;
  }

  render() {
    const HEADER_HEIGHT = Platform.OS === 'android' ? ACTION_BAR_HEIGHT : ACTION_BAR_HEIGHT + STATUS_BAR_HEIGHT;
    return (
      <View style={{flex: 1, backgroundColor: 'mistyrose'}}>
        <View style={{height: HEADER_HEIGHT, alignItems: 'flex-start', justifyContent: 'center', paddingLeft: 50, backgroundColor: '#9dadff'}}>
          <Text style={{fontSize: 16, color: 'white', fontWeight: 'bold', textAlign: 'center'}}>BOARD</Text>
        </View>
        {this._renderBoards()}
      </View>
    );
  }

  _renderBoards = () => {
    const self = this;
    if (!self.state.boardsData.length) {
      return (
        <View style={{flex: 1, alignItems: 'center', justifyContent: 'center'}}>
          <Text style={{fontSize: 18, color: 'mistyrose'}}>No Board</Text>
        </View>
      );
    } else {
      return (
        <View style={{flex: 1, backgroundColor: 'mistyrose'}}>
          <View style={{flex: 1}}>
            <ListView
              enableEmptySections={true}
              dataSource={self.state.boardsDataSource}
              renderRow={self._renderRow}
              renderSeparator={self._renderSeparator}
              renderScrollComponent={props => {
                return <ScrollView {...props} />;
              }}
              contentContainerStyle={{backgroundColor: 'mistyrose'}}
            />
          </View>
        </View>
      );
    }
  };

  _renderRow = (rowData, sectionID, rowID, highlightedRow) => {

    const self = this;
    const {navigator} = self.props;

    return (
      <TouchableHighlight
        style={{height: 50, alignItems: 'center', justifyContent: 'center', backgroundColor: 'ivory'}}
        underlayColor={'gray'}
        onPress={() => {
          navigator.push({component: BoardDetail, componentClassName: 'BoardDetail', passProps: {title: 'Board Detail', boardDetail: rowData.boardDetail}, type: 'normal'})
        }}>
        <View style={{alignItems: 'center', justifyContent: 'center'}}>
          <Text>{rowData.title}</Text>
        </View>
      </TouchableHighlight>
    );

  };

  _renderSeparator = (sectionID, rowID, adjacentRowHighlighted) => {
    return (
      <View
        key={`${sectionID}-${rowID}`}
        style={{height: 1, backgroundColor: 'hotpink'}} />
    );
  };


  _refreshBoards = () => {
    const self = this;
    api.get('board/list', {}).then((response) => {

      const boardsData = response.data.slice();
      self.setState({boardsData: boardsData});
      self.setState({boardsDataSource: self.state.ds.cloneWithRows(boardsData)})

    }).catch((error) => {

      console.warn('Fetching data failed.');

    })
  }
}

export default Board;