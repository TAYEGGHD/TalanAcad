/// <reference types="cypress" />

it('account creation test', function() {
    cy.visit('http://demo.guru99.com/test/newtours')
    cy.get('[width="77"] > a').click()
    cy.get(':nth-child(2) > [style="font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;"] > input').type('name1')
    cy.get(':nth-child(3) > [style="font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;"] > input').type('Lastname1')
    cy.get(':nth-child(4) > [style="font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;"] > input').type('123456789')
    cy.get('#userName').type('name@gmail.com')
    cy.get(':nth-child(7) > [style="font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;"] > input').type('Rue de la bource')
    cy.get(':nth-child(8) > [style="font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;"] > input').type('Tunis')
    cy.get(':nth-child(9) > [style="font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;"] > input').type('Tunis')
    cy.get(':nth-child(10) > [style="font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;"] > input').type('2035')
    cy.get('select').type('Tunisia')
    cy.get('#email').type('User1')
    cy.get(':nth-child(14) > [style="font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;"] > input').type('qwerty.5')
    cy.get(':nth-child(15) > [style="font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;"] > input').type('qwerty.5')
    cy.get(':nth-child(17) > td > input').click()

})

it.only('signin test', function(){
 cy.visit('https://demo.guru99.com/test/newtours/login.php')
 
})