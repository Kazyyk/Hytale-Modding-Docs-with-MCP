# BuilderObjectMapHelper

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder | Extends: BuilderObjectArrayHelper<Map<K, V>, V>

public class BuilderObjectMapHelper<K, V> extends BuilderObjectArrayHelper<Map<K, V>, V>

Reads a JSON array of builder objects and produces a `Map<K, V>` at build time. Each element is built, and a key is extracted from the built value using a provided `Function<V, K>`. Throws if duplicate keys are encountered.

## Type Parameters

- K | The map key type.
- V | The map value type (also the builder element type).

## Constructor


public BuilderObjectMapHelper(Class classType, Function<V, K> id, BuilderContext owner)

## Methods

### build


@Nullable
public Map<K, V> build(@Nonnull BuilderSupport builderSupport)

Builds each non-excluded element, extracts a key via the `id` function, and inserts into an ordered map. Throws `IllegalArgumentException` on duplicate keys.

### testEach


@Nullable
public <T, U> T testEach(@Nonnull BiFunction<Builder<V>, U, T> test, @Nonnull BuilderManager builderManager, ExecutionContext executionContext, U meta, T successResult, T emptyResult, Builder<?> parentSpawnable)

Iterates over elements, applying a test function to each resolved builder. Returns the first non-success result, or the success result if all pass.

## Related Types

- BuilderObjectArrayHelper -- parent class

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectReferenceHelper, BuilderObjectStaticHelper (and 29 more)

Complete API:
  public Map<K,V> build(BuilderSupport builderSupport)
  public void readConfig(JsonElement data, BuilderManager builderManager, BuilderParameters builderParameters, BuilderValidationHelper builderValidationHelper)
  public T testEach(BiFunction<Builder<V>,U,T> test, BuilderManager builderManager, ExecutionContext executionContext, U meta, T successResult, T emptyResult, Builder<?> parentSpawnable)

Fields:
private Function<V,K> id
