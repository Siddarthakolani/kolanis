import React from 'react';
import axios from 'axios';
const APPPLICATION_API_BASE_URL="http://localhost:8080/api/v1/applications"
class LoanApplicationService{
getApplication(){
    return axios.get(APPPLICATION_API_BASE_URL);
}
createApplication(application){
    return axios.post(APPPLICATION_API_BASE_URL,application);
}
getApplicationById1(applicationId1){
    return axios.get(APPPLICATION_API_BASE_URL + '/' + applicationId1);
}

updateApplication(application, applicationId1){
    return axios.put(APPPLICATION_API_BASE_URL + '/' + applicationId1, application);
}

deleteApplication(applicationId1){
    return axios.delete(APPPLICATION_API_BASE_URL + '/' + applicationId1);
}
}

export default new  LoanApplicationService();