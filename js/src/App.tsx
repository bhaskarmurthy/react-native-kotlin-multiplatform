import React, {useEffect, useState} from 'react';
import {View, Text, StyleSheet} from 'react-native';
import GreetingModule from './native/GreetingModule';

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
  label: {
    fontSize: 24,
  },
});

const App = () => {
  const [greeting, setGreeting] = useState<string>('');
  useEffect(() => GreetingModule.greeting(setGreeting), []);
  return (
    <View style={styles.container}>
      <Text style={styles.label}>{greeting}</Text>
    </View>
  );
};

export default App;
