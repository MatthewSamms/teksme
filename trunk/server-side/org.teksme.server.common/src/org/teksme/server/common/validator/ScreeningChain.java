package org.teksme.server.common.validator;

/**
 * A chain of specific tests to detect problems in the request or the data.
 */
public interface ScreeningChain
{
  /**
   * Adds the diagnostic to the chain.
   */
  void add(Screening diagnostic);

  /**
   * Adds the {@link Screening#getChildren children} of the diagnostic to the chain.
   */
  void addAll(Screening diagnostic);

  /**
   * If the diagnostic has {@link Screening#getChildren children}, 
   * {@link #addAll add}s those children,
   * otherwise, {@link #add add}s the diagnostic. 
   */
  void merge(Screening diagnostic);
  
}

