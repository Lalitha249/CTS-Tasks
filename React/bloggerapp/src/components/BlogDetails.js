import React from "react";

function BlogDetails() {

    const blogs = [
        {
            id:1,
            title:"React Introduction",
            content:"Learn React components"
        },
        {
            id:2,
            title:"JavaScript ES6",
            content:"Learn modern JavaScript"
        },
        {
            id:3,
            title:"Spring Boot REST API",
            content:"Create backend APIs"
        }
    ];


    return (

        <div>

            <h2>Blog Details</h2>

            {
                blogs.map(blog => (

                    <div key={blog.id}>

                        <h3>{blog.title}</h3>

                        <p>{blog.content}</p>

                    </div>

                ))
            }

        </div>

    );

}

export default BlogDetails;