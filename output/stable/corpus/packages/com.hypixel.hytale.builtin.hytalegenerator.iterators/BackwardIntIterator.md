# BackwardIntIterator

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.iterators | Implements: IntIterator, Iterator

public class BackwardIntIterator implements IntIterator, Iterator<Integer>

Utility type in the `iterators` subsystem.

## Accessors

- hasNext() | boolean | Boolean accessor.
- getCurrent() | Integer | Accessor method.

## Methods

- nextInt() | int | Instance method.
- next() | Integer | Instance method.

Also in this package: ForwardIntIterator, IntIterators

Complete API:
  public boolean hasNext()
  public int nextInt()
  public Integer next()
  public Integer getCurrent()
  public BackwardIntIterator clone()

Fields:
private int min
private int current
