# Functional Requirements

## Requirement 1: User Registration and Login

**As a new user
I want to be able to register for an account
So that I can be able to shop, purchase products, and use other features of the application.**

#### *Examples:*

##### Example 1:
Given I am on the registration screen
When I provide a valid email and strong password
Then My account should be created successfully and I should be logged in to the main page

##### Example 2:
Given I am on the registration page
When I provide an already registered email
Then I should see an error message and the account should not be created.

##### Example 3:
Given I already have an account
When I attempt to login with a registered correct email and password
Then I should be logged in and redirected to the main page

---

## Requirement 2: Product Search

**As a user
I want to be able to search for products
So that I can find products I'm interested in quickly**

#### *Examples:*

##### Example 1:
Given I am on a page
When I enter a valid product name in the search bar and hit search or press enter
Then the application should display a list of products matching that search term

##### Example 2:
Given I am bro3sing a category
When I apply filters like price range or rating
Then only products that meet the criteria should be displayed

##### Example 1:
Given I search with an empty string or invalid input
When I hit search or press enter
Then an error message shoudl be shown, or no results should be displayed

---
## Requirement 3: Shopping Cart

**As a user
I want to add, update, and remove products from my shopping cart 
So that I can manage my purchases before checkout**

#### *Examples:*
##### Example 1:
Given I have found a product I want to buy
When I hit add to cart
Then the product should appear in my cart with a default quantity of 1

##### Example 2:
Given I have multiple items in myu cart
When I update the quantity of a product or remove an item
Then the cart should reflect these changes in real time

##### Example 3:
Given I have items in my cart
I proceed to checkout without logging in
Then I should be prompoted to log in or sign up before continuing

---

## Requirement 4: Checkout and payment processing

**As a user
I want to securely complete my purchase through a checkout process
So that I can pay for and recieve my items**

#### *Examples:*

##### Example 1:
Given I have items in my cart
When I go to checkout and enter valid payment details
Then my order should be processed, and I should recieve a confirmation email and message on the page

##### Example 2:
Given I have invalid or expired payment details
When I attempt to checkout
Then I should see an error message and the order should not be processed

##### Example 3:
Given I am eligible for a discount
When I enter a valid discount code
Then the total amount should be updated to reflect the discount

---

## Requirement 5: Order Tracking

**As a user
I want to be able to track my order status after making a purchase
So that I can know when my items will arrive**

#### *Examples:*

##### Example 1:
Given I have successfully placed an order
When I go to the My orders page
Then I should see a list of my orders along with their statuses

##### Example 2:
Given I try to access an order status page without being logged in
When I attempt to view order details
Then I should be prompted to log in

##### Example 3:
Given My order has been shipped
When I click on order details
Then I should see shipping carrier details, tracking number, and expected delivery date

---

## Requirement 6: Product Reviews

**As a user
I want to leave reviews and ratings for purchased products
So that I can share my experience and help other users**

#### *Examples:*

##### Example 1:
Given I have purchased a product
When I navigate to the product page and submit a valid review and rating
Then the review should appear under the product's review section, and the overall rating should be updated

##### Example 2:
Given I try to submit a review without purchasing a product
When I attempt to submit a review
Then the system should not allow the review

---

## Requirement 7: Admin Product Management

**As an Admin,
I want to add, update, or remove products in the catalog
So I can keep the inventory up to date**

#### *Examples:*

##### Example 1:
Given I am logged in **As a store Admin
When I navigatye to the product management page and enter new product details
Then the product should be added to the catalog and visible to the customers

##### Example 2:
Given a product has incorrect information
When I update the product's details
Then the catalog should reflect the changes in real time

---

## Requirement 8: Wishlist Management

**As a user
I want to be able to add items to a wishlist 
So that I can save products I am interested in purchasing later**

#### *Examples:*
##### Example 1:
Given I am browsing products
When I click Add to Wishlist on a product page
Then the product should be saved to my wishlist, accessible from my profile

##### Example 2:
Given I have multiple items in my wishlist
When I remove an item or move it to cart
Then the wishlist should reflect these changes, and the product should no longer appear if removed

##### Example 3:
Given I have an empty wishlist
When I try to view it
Then the system should display a message indicating my wishlist is empty

---
