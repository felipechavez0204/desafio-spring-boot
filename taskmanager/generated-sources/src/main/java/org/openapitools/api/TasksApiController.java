package org.openapitools.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import jakarta.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-31T03:08:15.250988-03:00[America/Santiago]")
@Controller
@RequestMapping("${openapi.taskManager.base-path:/api}")
public class TasksApiController implements TasksApi {

    private final NativeWebRequest request;

    @Autowired
    public TasksApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
