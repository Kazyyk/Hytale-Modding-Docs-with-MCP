# LoadOperationsFromAssetOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.saveandload | Extends: SequenceBrushOperation

public class LoadOperationsFromAssetOperation extends SequenceBrushOperation

Concrete implementation extending `SequenceBrushOperation`.

## Fields

- assetId | String | String field.

## Constructors

- LoadOperationsFromAssetOperation() | Creates a new LoadOperationsFromAssetOperation instance.

## Methods

- getAssetId() | String | public method.
- setAssetId(@Nonnull String assetId) | void | public method.

Also in this package: LoadBrushConfigOperation, PersistentDataOperation, SaveBrushConfigOperation, SaveIndexOperation

Complete API:
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)
  public String getAssetId()
  public void setAssetId(String assetId)

Fields:
public static final BuilderCodec<LoadOperationsFromAssetOperation> CODEC
private String assetId
