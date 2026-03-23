# BuilderObjectStaticHelper

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder | Extends: BuilderObjectReferenceHelper<T>

public class BuilderObjectStaticHelper<T> extends BuilderObjectReferenceHelper<T>

A reference helper variant that enforces that the resolved builder is inline (static). Throws `IllegalStateException` if the JSON contains a `"Reference"` or `"Local"` reference. Used in contexts where dynamic resolution is not supported and the builder must be fully defined in-place.

## Methods

### readConfig


@Override
public void readConfig(@Nonnull JsonElement data, @Nonnull BuilderManager builderManager, @Nonnull BuilderParameters builderParameters, @Nonnull BuilderValidationHelper builderValidationHelper)

Delegates to parent, then asserts the result is a final (inline) builder.

### setInternalReference / setFileReference

Both throw `IllegalStateException` -- references are not permitted.

### staticBuild


@Nullable
public T staticBuild(@Nonnull BuilderManager manager)

Builds the inline builder with a `null` BuilderSupport, passing only the manager. Used for static initialization that does not require entity context.

## Related Types

- BuilderObjectReferenceHelper -- parent class
- BuilderObjectStaticListHelper -- uses this for list elements

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper (and 29 more)

Complete API:
  public void readConfig(JsonElement data, BuilderManager builderManager, BuilderParameters builderParameters, BuilderValidationHelper builderValidationHelper)
  protected void setInternalReference(StringHolder holder, InternalReferenceResolver referenceResolver)
  protected void setFileReference(StringHolder holder, JsonObject jsonObject, BuilderManager builderManager)
  public T staticBuild(BuilderManager manager)
