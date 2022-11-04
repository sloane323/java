import logo from './logo.svg';
import './App.css';
import CounterBox from './Compoments/CounterBox';
import Memo from './Compoments/Memo';
import News from './Compoments/News';
import NewsSagaBox from './Compoments/NewsSagaBox';

function App() {
  return (
    <div className="App">
      <header className="App-header">
       
      <CounterBox />
      <Memo />
      <News />
      <NewsSagaBox />
      </header>
    </div>
  );
}

export default App;
