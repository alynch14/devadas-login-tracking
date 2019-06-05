# Medifor-Demo-UI

## Description
The user interface for the MediFor-Demo of the Visual Media Analytics Platform (VMAP)

### New Developer Preliminary Software Requirements
For onboarding developers please install the following software:

#### Mac Users

##### Homebrew

Paste the following in your terminal : /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
It will download Homebrew into the usr/local folder

After installation run the following command to ensure its installed
```shell
brew --version
```
Should show current version  2.1.4

##### Git
Run following command in terminal:
```shell
brew install git
```
After installation run the following command to ensure its installed
```shell
git --version
```
Should show current version 2.21.0

##### Node
Run following command in terminal:
```shell
brew install node
```
After installation run the following command to ensure its installed
```shell
node --version
```
Should show current version  12.3.1

##### Ansible
Run following command in terminal:
```shell
brew install ansible
```
After installation run the following command to ensure its installed
```shell
ansible --version
```
Should show current version 2.8.0

##### FFMpeg
Run following commans in terminal:
```shell
brew install libvpx
brew install ffmpeg --with-libvpx
```
After installation run the following command to ensure its installed
```shell
ffmpeg --version
```
Should show current version 4.1.3

### Additional Software and VPN

##### MediFor VPN

To connect to the MediForVPN navigate to the following link: https://mediforprogram.com/wiki/display/MEDIFOR/Connect+to+VPN

You will also need to generate an SSH key for access to the VPN

##### Analytic-Worker

Ensure that you have maintainer access to the Analytic-Worker repository

##### Docker & Containers

Navigate to the following link to install Docker: https://www.docker.com/

Open Docker and navigate to preferences
* Under the Daemon tab add 10.107.128.1 to insecure registry then hit 'Apply & Restart'
* Under the Advanced tab move the slider for memory to roughly half of your available RAM then hit 'Apply & Restart'

Clone the repository to your local machine

Open your terminal and navigate to the 'pipeline' directory of the proeject then run the following commands (Ensure that you are connected to the VPN):
```shell
docker login gitlab-registry.mediforprogram.com
docker-compose pull
docker-compose up
```
This will pull down all the containers...it will take some time

### Running the MediFor Demo

For node modules, in the root, client and server directories run:
```script
npm install
```

In the project's root directory run the following command:
```script
ansible-playbook -i inventory deployment
```

To start the development server run the following command in the project's root directory:
```script
npm start
```
