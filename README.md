# Project_BrinMeyAir

This project was made to simulate a website from a fake airline I created on an airline management mobile app.
It was a cargo airline, therefore, you will find it has features you'd expect from a cargo airline.
It uses React for the frontend, Spring Boot, as the API for RESTful ops, and MySQL as the database.

When you first visit the page, you would be greeted with the welcome page, with a navigation bar on the top, and a footer on the bottom. 

In the navigation bar, you will find a logo button that navigates you to the welcome page.

Next to that is the services page. Here is where you would go to learn more about the shipping services offered by the company.
On this page, there will be a drop-down menu that shows the different services offered.
When you click one of those options, an API call is made to Spring Boot, which retrieves data from MySQL to show all of the related information about that service.
Different options for retrieveing those services are provided, but a visitor cannot add, update, or delete any of the services given.

To the right of the services button is the tracking button.
Here is where the user would type a tracking number into the text field to retrieve information about a shipment.
When a user enters a number, one of two things happen.
If a number is invalid, the page will tell the user that no shipment with that tracking number could be found.
If a number is valid though, another API call is made to retrieve information about the shipment.
In this area, the user can only see shipments, but can't modify them.

To the right of the tracking button is the shipping button.
Here the user actually creates a shipment by filling out the fields, checking the buttons, and verifying everything is correct.
It checks for invalid inputs such as empty fields, or words where numbers are expected.
Here, the user could also add multiple items to a single shipment if they desired.

To the right of the shipping button is the contact us button.
Here the button does just that, contact the company.
Like the shipping page, the user fills out fields and checks for any errors.
Some of which are empty fields, and invalid inputs for names, emails, etc.
The form also gives the option of contacting on behalf of a company, or adding a custom message.

To the right of this will be a button where a customer can sign into their account and load any information related to that customer. 
They can view information about the customer themselves, and any shipments associated with them. 

The footer is fairly simple to use.
The Who We Are link navigates the user to a page that shares more about the company.
Next to that is another link to the same contact us page described before.

Finally, to the right of that is a simple text that gives a fake address for the company's headquarters.

Here is the link to view the Kanban board for the project:
https://trello.com/b/qRyBa3fy
