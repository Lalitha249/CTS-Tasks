import React from "react";

function UserPage() {

    return (

        <div>

            <h2>Welcome User</h2>

            <h3>You can now Book your Tickets.</h3>

            <table border="1" cellPadding="10">

                <thead>
                    <tr>
                        <th>Flight</th>
                        <th>From</th>
                        <th>To</th>
                        <th>Price</th>
                        <th>Book</th>
                    </tr>
                </thead>

                <tbody>

                    <tr>
                        <td>AI101</td>
                        <td>Chennai</td>
                        <td>Delhi</td>
                        <td>₹6500</td>
                        <td>
                            <button>Book</button>
                        </td>
                    </tr>

                    <tr>
                        <td>6E205</td>
                        <td>Bangalore</td>
                        <td>Mumbai</td>
                        <td>₹5200</td>
                        <td>
                            <button>Book</button>
                        </td>
                    </tr>

                    <tr>
                        <td>SG301</td>
                        <td>Hyderabad</td>
                        <td>Kolkata</td>
                        <td>₹4800</td>
                        <td>
                            <button>Book</button>
                        </td>
                    </tr>

                </tbody>

            </table>

        </div>

    );

}

export default UserPage;