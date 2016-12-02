mvn clean
git add .
git commit -m "Commiting change on `date`"
git push heroku master
heroku logs -t

