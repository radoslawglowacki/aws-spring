import logo from './logo.svg';
import './App.css';
import React, {useState, useEffect} from "react";
import axios from "axios";


const UserProfiles = () => {
  const [userProfiles, setUserProfiles] = useState([]);
  const fetchUserProfiles = () => {
    axios.get("http://localhost:8084/api/v1/user-profile").then(res => {
      console.log(res)
      setUserProfiles(res.data)
    });
  }
  useEffect(() => {
    fetchUserProfiles();
  }, [])

  return userProfiles.map((userProfile, index) => {
    return(<div key={index}>
      <h1>{userProfile.username}</h1>
      <p>{userProfile.userProfileId}</p>
      
    </div>)
  })
}

function App() {
  return (
    <div className="App">
  <UserProfiles/>
    </div>
  );
}

export default App;
