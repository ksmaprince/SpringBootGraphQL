package com.khun.SpringBootGraphQL.exception;

import graphql.ErrorClassification;
import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

import java.util.List;

public class ResourceNotFoundException extends RuntimeException implements GraphQLError {

    public ResourceNotFoundException(String message) {
        super(message);
    }

    @Override
    public List<SourceLocation> getLocations() {
        return List.of();
    }

    @Override
    public ErrorClassification getErrorType() {
        return ErrorType.DataFetchingException;
    }
}
