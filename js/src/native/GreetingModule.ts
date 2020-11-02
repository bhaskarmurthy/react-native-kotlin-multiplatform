import {NativeModules} from 'react-native';

interface GreetingModule {
  greeting: (result: string) => void;
}

export default NativeModules.GreetingModule as GreetingModule;
