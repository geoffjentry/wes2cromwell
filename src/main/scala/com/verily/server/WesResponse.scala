package com.verily.server

// The WesResponse provides a trait for all possible responses to requests to the WES REST API
sealed trait WesResponse

case class WesResponseError(msg: String, status_code: Int) extends WesResponse

case class WesResponseCreateWorkflowId(workflow_id: String) extends WesResponse

case class WesResponseDeleteWorkflowId(workflow_id: String) extends WesResponse

case class WesResponseStatus(workflow_id: String, state: WorkflowState) extends WesResponse

case class WesResponseWorkflowList(workflow: List[WesResponseStatus]) extends WesResponse

