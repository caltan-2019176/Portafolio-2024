import {useState} from 'react'
import axios from 'axios'
import './converter.css'

export const Converter = () => {
  const[formData, setFormData] = useState({
    from: '', 
    to: '', 
    amount: ''
  })
  const [result, setResult] = useState(null)
  const [error, setError] = useState('')

  const currencyCode = ['GTQ', 'EUR', 'MXN', 'USD', 'HNL', 'CRC']
  const url = 'http://localhost:2656/convert'

  const handleChange = (e) =>{
    const {name, value} = e.target
    setFormData((prevData)=>({
      ...prevData, 
      [name]: value
    }))
    
  }
  
  const handleSubmit = async(e) =>{
    e.preventDefault()
    try {
      const {data} = await axios.post(url, formData)
      console.log(data)
      setResult(data)
    } catch (error) {
      console.log(error.message)
      setResult('')
      setError(
        {"Error":
        error?.response ? error?.response?.data?.message: error?.message}
      )
    }
  }

  return (
    <div>
      <section className='converter'>
        <form onSubmit={handleSubmit} >
          <select 
            className='input'
            name="from"
            value={formData.from}
            onChange={handleChange}
            >
            <option value="">Select from currency</option>
            {
              currencyCode.map(code => (
                <option key={code} value={code}>
                  {code}
                </option>
              ))
            }
          </select>


          <select 
            className='input'
            name="to"
            value={formData.to}
            onChange={handleChange}>
            <option value="">Select from currency</option>
            {
              currencyCode.map(code => (
                <option key={code} value={code}>
                  {code}
                </option>
              ))
            }
          </select>

          <input 
            className='input'
            name='amount' 
            type="number" 
            value={formData.amount} 
            onChange={handleChange} 
            placeholder='Amount'
          />
          <button type='submit' className='submit-btn'>Convert</button>
        </form>
        {
            result && (
              <div className='result'>
              <p>Conversion Rate: {result.conversionRate} </p>
              <h2>Conversion Amount: {result.conversionAmount} </h2>
            </div>
            )
        }
        {
          error && <p>Error: {error.Error} </p>
        }
      </section>
    </div>
  )
}
