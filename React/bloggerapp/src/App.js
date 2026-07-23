import React from "react";

import "./App.css";

import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";


function App() {


    const flag = 1;


    // Method 1: If else rendering

    let component;


    if(flag === 1)
    {
        component = <BookDetails />;
    }

    else if(flag === 2)
    {
        component = <BlogDetails />;
    }

    else
    {
        component = <CourseDetails />;
    }



    return (

        <div className="App">


            <h1>Blogger Application</h1>


            {component}



            <hr />


            {/* Method 2: Ternary operator */}

            {

                flag === 1 
                ?
                <BookDetails />

                :

                <BlogDetails />

            }



            <hr />


            {/* Method 3: Logical AND operator */}

            {

                flag === 1 && <CourseDetails />

            }



        </div>

    );

}


export default App;