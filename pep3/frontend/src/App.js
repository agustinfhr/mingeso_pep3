import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Route, Routes } from "react-router-dom";
import PruebaFacilComponent from './Components/PruebaFacilComponent';
import PruebaIntermedioComponent from './Components/PruebaIntermedioComponent';
import PruebaAvanzadoComponent from "./Components/PruebaAvanzadoComponent";
import HomeComponent from './Components/HomeComponent';
import ResultadosComponent from './Components/ResultadosComponent';


function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<HomeComponent />} />
          <Route path="/prueba-facil" element={<PruebaFacilComponent />} />
          <Route path="/prueba-intermedio" element={<PruebaIntermedioComponent />} />
          <Route path="/prueba-avanzado" element={<PruebaAvanzadoComponent />} />
          <Route path="/resultados" element={<ResultadosComponent/>} />

        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
