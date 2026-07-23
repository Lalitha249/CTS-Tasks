import React from "react";

function CourseDetails() {

    const courses = [
        {
            id:1,
            name:"Java Full Stack",
            duration:"6 Months"
        },
        {
            id:2,
            name:"React Development",
            duration:"3 Months"
        },
        {
            id:3,
            name:"Cloud Fundamentals",
            duration:"2 Months"
        }
    ];


    return (

        <div>

            <h2>Course Details</h2>


            <table border="1">

                <thead>

                    <tr>

                        <th>Course</th>

                        <th>Duration</th>

                    </tr>

                </thead>


                <tbody>

                    {

                        courses.map(course => (

                            <tr key={course.id}>

                                <td>{course.name}</td>

                                <td>{course.duration}</td>

                            </tr>

                        ))

                    }

                </tbody>


            </table>


        </div>

    );

}

export default CourseDetails;