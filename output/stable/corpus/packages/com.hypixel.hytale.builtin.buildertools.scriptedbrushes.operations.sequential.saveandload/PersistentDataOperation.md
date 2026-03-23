# PersistentDataOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.saveandload | Extends: SequenceBrushOperation

public class PersistentDataOperation extends SequenceBrushOperation

Concrete implementation extending `SequenceBrushOperation`.

## Fields

- variableNameArg | String | String field.
- operationArg | ArgTypes.IntegerOperation | ArgTypes.IntegerOperation field.
- modifierArg | Integer | Integer field.

## Constructors

- PersistentDataOperation() | Creates a new PersistentDataOperation instance.

Also in this package: LoadBrushConfigOperation, LoadOperationsFromAssetOperation, SaveBrushConfigOperation, SaveIndexOperation

Complete API:
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final BuilderCodec<PersistentDataOperation> CODEC
public String variableNameArg
public ArgTypes.IntegerOperation operationArg
public Integer modifierArg
