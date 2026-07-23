import React from "react";
import "./App.css";

function App() {

  const offices = [
    {
      id: 1,
      name: "DBS Business Center",
      rent: 55000,
      address: "Chennai",
      image: "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=600"
    },
    {
      id: 2,
      name: "Regus Office Space",
      rent: 75000,
      address: "Bangalore",
      image: "https://images.unsplash.com/photo-1497366811353-6870744d04b2?w=600"
    },
    {
      id: 3,
      name: "Smart Workspace",
      rent: 45000,
      address: "Hyderabad",
      image: "https://images.unsplash.com/photo-1497366412874-3415097a27e7?w=600"
    }
  ];

  return (

    <div className="App">

      <h1>Office Space Rental App</h1>

      {
        offices.map((office) => (

          <div className="card" key={office.id}>

            <img
              src={office.image}
              alt={office.name}
              width="400"
              height="250"
            />

            <h2>{office.name}</h2>

            <h3
              style={{
                color: office.rent < 60000 ? "red" : "green"
              }}
            >
              Rent : Rs. {office.rent}
            </h3>

            <h3>Address : {office.address}</h3>

          </div>

        ))
      }

    </div>

  );
}

export default App;