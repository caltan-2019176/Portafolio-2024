
import { Navbar } from '../components/navbar/Navbar.jsx'
import { Converter } from '../components/converter/Converter.jsx'
import { AdditionalInfor } from '../components/additionalInfo/AdditionalInfor.jsx'

export const Home = () => {
  return (
    <>
    <Navbar></Navbar>
    <br />
    <Converter></Converter>
    <br />
    <AdditionalInfor></AdditionalInfor>
    <br />
    <div>Está es la página principal</div>

    
    </>
  )
}
