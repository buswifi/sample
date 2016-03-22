package com.linkedroad.util.pipeline;

import com.linkedroad.util.exception.PipelineException;
import com.linkedroad.util.payload.Payload;


public interface Pipeline<P extends Payload> {
  /*
   * The Name of this Pipeline.
   */
  String getName();

  /**
   * 
   * @return A proper reusable payload object for the Pipeline execution.
   * @throws PipelineException
   */
  P createPayload() throws PipelineException;



  /**
   * Execute the Synchronous <code>Stage</code>s, by the order of their position in synchronous
   * Stage list, (Note: the stages are executed in the same thread as the caller)
   * 
   * @param payload the <code>Payload</code> object
   * @throws PipelineException
   */
  void executeSynchronous(P payload) throws PipelineException;


  /**
   * Execute the Asynchronous <code>Stage</code>s, by the order of their position in asynchronous
   * Stage list, (Note: the stages are executed in a new thread, not the caller's)
   * 
   * @param payload the <code>Payload</code> object
   * @throws PipelineException
   */
  void executeAsynchronous(P payload) throws PipelineException;

  /**
   * Gets the number of active payload objects in the payload ObjectPool.
   * 
   * @return number of active payload objects in the payload ObjectPool.
   */
  int getNumOfActivePayloads();

  void abandonPayload(P payload) throws PipelineException;

}
