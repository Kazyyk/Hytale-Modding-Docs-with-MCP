# SimpleBiomeMap

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.biomemap | Extends: BiomeMap

public class SimpleBiomeMap<V> extends BiomeMap<V>

Utility type in the `biomemap` subsystem.

## Accessors

- setDefaultRadius(int defaultRadius) | void | Mutator method.

## Methods

- apply(int x, int z, WorkerIndexer.Id id) | BiomeType | Instance method.
- allPossibleValues() | List<BiomeType> | Instance method.

Also in this package: BiomeMap

Complete API:
  public void setDefaultRadius(int defaultRadius)
  public BiomeType apply(int x, int z, WorkerIndexer.Id id)
  public List<BiomeType> allPossibleValues()

Fields:
private int defaultTransitionRadius
private Map<Long,Integer> pairHashToRadius
private BiCarta<BiomeType> carta
