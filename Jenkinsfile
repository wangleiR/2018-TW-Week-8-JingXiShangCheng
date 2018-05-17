node {
	stage('CheckOutstage'){
		checkout scm
		echo 'Check Out!'
		sh './gradlew clean'
	}
	stage('Build'){
		echo 'Build Stage!'
		sh './gradlew build'
	}
	stage('Test'){
		echo 'Test Stage'
		sh './gradlew test'
	}
}
