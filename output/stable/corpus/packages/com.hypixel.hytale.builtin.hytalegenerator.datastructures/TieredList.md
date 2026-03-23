# TieredList

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.datastructures

public class TieredList<E>

Class in the datastructures subsystem.

## Fields

- elements | Map<Integer, ArrayList<E>> | final Map<Integer, ArrayList<E>> field.
- tiers | int | final int field.
- sortedTierList | List<Integer> | List<Integer> field.

## Constructors

- TieredList() | Creates a new TieredList instance.
- TieredList(int tiers) | Creates a new TieredList instance.

## Methods

- addTier(int tier) | TieredList<E> | public method.
- removeTier(int tier) | TieredList<E> | public method.
- add(@Nonnull E element, int tier) | void | public method.
- isEmpty() | boolean | public method.
- peek() | E | public method.
- remove() | E | public method.
- size() | int | public method.
- size(int tier) | int | public method.
- forEach(int tier, @Nonnull Consumer<? super E> consumer) | TieredList<E> | public method.
- removeEach(int tier, @Nonnull Consumer<? super E> consumer) | TieredList<E> | public method.
- forEach(@Nonnull Consumer<? super E> consumer) | TieredList<E> | public method.
- removeEach(@Nonnull Consumer<? super E> consumer) | TieredList<E> | public method.
- iterator(int tier) | Iterator<E> | public method.
- listOf(int tier) | List<E> | public method.
- tierExists(int tier) | boolean | public method.
- getTiers() | List<Integer> | public method.
- updateSortedTierList() | void | private method.
- toString() | String | public method.

Also in this package: CollectionFactory, WeightedMap

Complete API:
  public TieredList<E> addTier(int tier)
  public TieredList<E> removeTier(int tier)
  public void add(E element, int tier)
  public boolean isEmpty()
  public E peek()
  public E remove()
  public int size()
  public int size(int tier)
  public TieredList<E> forEach(int tier, Consumer<? super E> consumer)
  public TieredList<E> removeEach(int tier, Consumer<? super E> consumer)
  public TieredList<E> forEach(Consumer<? super E> consumer)
  public TieredList<E> removeEach(Consumer<? super E> consumer)
  public Iterator<E> iterator(int tier)
  public List<E> listOf(int tier)
  public boolean tierExists(int tier)
  public List<Integer> getTiers()
  private void updateSortedTierList()
  public String toString()

Fields:
private final Map<Integer,ArrayList<E>> elements
private final int tiers
private List<Integer> sortedTierList
