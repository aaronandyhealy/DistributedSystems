### How to run

* Start up Wamp
* Open the MySQL console
* Create the database using the SQL commands in "booking.sql"
* Open the project in Eclipse
* Right click on RMI project and Run As > Java Application
* The console should show "Server Ready"
* Right click on RESTJersey project and Run As > Run on Server
* The "index.jsp" page should open in a new tab
* The user can chose to:

1. Create a Booking
This is a form which the user must enter there Customer ID, a  Hire Date, a Return Date and a Car ID into. On submission of this form a new booking will be created.

2. View All Bookings
This displays the entire list of Bookings.

3. Update a Booking
This is a form which the user must enter the Customer ID. They can then edit the Hire and Return Dates or the Car ID.

4. Delete a Booking
This is an input box which the user must enter the Booking ID of the order they wish to delete. Submission will delete the booking from the database.
