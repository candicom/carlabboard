import React, { Component, PropTypes } from 'react';
import { Platform, View, Text, Image, TouchableHighlight, ScrollView, ListView } from 'react-native';

class BoardDetail extends Component {


  constructor(props) {
    super(props);

  }

  render() {
    const self = this;
    const {boardDetail} = self.props;
    return (
      <View style={{flex: 1, alignItems: 'center', justifyContent: 'center', padding: 30}}>
        <Text>
          {boardDetail.content}
        </Text>
      </View>
    )

  }

}

export default BoardDetail;