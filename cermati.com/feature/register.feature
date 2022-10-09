Feature: Register

Scenario: Successfully register the new member

Given Launch browser
And Open url "https://www.cermati.com/app/gabung"
And Enter the required information field
When Click on Daftar button
Then We can see the verification page contains "Pilih Metode Verifikasi"
And Close browser