import React, { Component } from 'react'
import LoanApplicationService from '../service/LoanApplicationService'
class ViewApplicationComponent extends Component {
    constructor(props) {
        super(props)

        this.state = {
            id1: this.props.match.params.id1,
            application: {}
        }
    }

    componentDidMount(){
        LoanApplicationService.getApplicationById1(this.state.id1).then( response => {
            this.setState({application: response.data});
        })
    }

    render() {
        return (
            <div>
                <br></br>
                <div className = "card col-md-6 offset-md-3">
                    <h3 className = "text-center"> View Application Details</h3>
                    <div className = "card-body">
                        <div className = "row">
                            <label> ApplicationId: </label>
                            <div> { this.state.application.applicationId }</div>
                        </div>
                        
                        <div className = "row">
                            <label> ApplicationDate: </label>
                            <div> { this.state.application.applicationDate }</div>
                        </div>
                        <div className = "row">
                            <label> Customer </label>
                            <div> { this.state.application.customer }</div>
                        </div>
                        <div className = "row">
                            <label> LoanAppliedAmount: </label>
                            <div> { this.state.application.loanAppliedAmount }</div>
                        </div>
                        <div className = "row">
                            <label> LoanApprovedAmount: </label>
                            <div> { this.state.application.loanApprovedAmount }</div>
                        </div>
                        <div className = "row">
                            <label> FinanceVerificationApproval: </label>
                            <div> { this.state.application.nationality }</div>
                        </div>
                        <div className = "row">
                            <label> AdminApproval: </label>
                            <div> { this.state.application.adminApproval }</div>
                        </div>
                        <div className = "row">
                            <label> Status: </label>
                            <div> { this.state.application.status }</div>
                        </div>
                    </div>

                </div>
            </div>
        )
    }
}



export default ViewApplicationComponent