# Mutual Exclusion and Barrier synchronization in Multiprogramming

The objective with this code is to allow for the implementation of a critical section and barrier synchronization of concurrent threads. These concepts are crucial in multiprogramming. The mutual exclusion and barrier synchronization will be achieved using semaphores. 
  
 The Semaphore is a class that implements the semaphore operations Signal()/V() and Wait()/P() using Java’s synchronization monitor primitives, such as, synchronized, wait(), and notify(). Objects of this class are going to be used to once again bring operations into the right order. 

The Synchronization Quest is based on the idea, where you have to synchronize all the
threads according to some criteria. These criteria are:
* PHASE I of every thread must be done before any of them may begin PHASE II.
* PHASE II must be executed in the ascending order (...4-5-6…) of their TID.

We are going utilize the BaseThread data member – siTurn – to indicate the thread ID (TID) of the thread that is allowed to proceed to <phase II> (details below).
There are four other methods in the BaseThread. Two of them are phase1() and phase2(), which barely do anything useful. However, they indicate the phase # and the state of the currently executing thread. Another method is turnTestAndSet(). This method tests both the turn and the TID for equality, and increments/decrements the turn if they are equal. The method returns true if the turn has changed; false otherwise.
