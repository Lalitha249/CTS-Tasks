import React from "react";

function GuestPage() {

    return (

        <div>

            <h2>Welcome Guest</h2>

            <h3>Flight Details</h3>

            <table border="1" cellPadding="10">

                <thead>
                    <tr>
                        <th>Flight</th>
                        <th>From</th>
                        <th>To</th>
                        <th>Price</th>
                    </tr>
                </thead>

                <tbody>
                    <tr>
                        <td>AI101</td>
                        <td>Chennai</td>
                        <td>Delhi</td>
                        <td>₹6500</td>
                    </tr>

                    <tr>
                        <td>6E205</td>
                        <td>Bangalore</td>
                        <td>Mumbai</td>
                        <td>₹5200</td>
                    </tr>

                    <tr>
                        <td>SG301</td>
                        <td>Hyderabad</td>
                        <td>Kolkata</td>
                        <td>₹4800</td>
                    </tr>
                </tbody>

            </table>

            <br />

            <h3>Please Login to Book Tickets.</h3>

        </div>

    );

}

export default GuestPage;