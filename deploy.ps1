# Build the application
mvn clean package

# Stop if the build fails
if ($LASTEXITCODE -ne 0) {
    Write-Host "Build failed!"
    exit 1
}

# Deploy the WAR to Tomcat
Copy-Item ".\target\greeting.war" "D:\Tools\apache-tomcat-10.1.61\webapps\" -Force

Write-Host "Deployment completed!"