import React from 'react';
import logo from './logo.svg';
import './App.css';
import { Status, init as mnUIInit } from '@modeln/modn-phoenix-ui';
import 'fontsource-manrope';

import 'ag-grid-community/dist/styles/ag-grid.css';
import 'ag-grid-community/dist/styles/ag-theme-alpine.css';
import 'ag-grid-enterprise';
import '@modeln/modn-phoenix-ui/agGridTheme.scss';
import 'antd/dist/antd.less';

function App() {
  mnUIInit({} as any);
  
  return (
    <div className='App'>
      <header className='App-header'>
        <img src={logo} className='App-logo' alt='logo' />
        <Status type='error' />
        <p>
          Edit <code>src/App.tsx</code> and save to reload.
        </p>
        <a
          className='App-link'
          href='https://reactjs.org'
          target='_blank'
          rel='noopener noreferrer'
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
