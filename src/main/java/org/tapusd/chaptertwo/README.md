## Notice
We should say away from Java util Observable and Observer as they do not allow flexibility.
Because `java.util.Observable` is a class not interface. So if a class already extends other class
we can't use observer pattern with this.
---
So it is better to implement own custom observer interface and use that if needed.   
