# BrushOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.system

public abstract class BrushOperation

## Fields

- public static final CodecMapCodec<BrushOperation> OPERATION_CODEC
- public static final Map<String, Supplier<BrushOperation>> BRUSH_OPERATION_REGISTRY
- private final String name
- private final String description
- private final Map<String, BrushOperationSetting<?>> registeredOperationSettings

## Constructors

- public BrushOperation(String name, String description)

## Methods

- public abstract void modifyBrushConfig(@Nonnull Ref<EntityStore> var1, @Nonnull BrushConfig var2, @Nonnull BrushConfigCommandExecutor var3, @Nonnull ComponentAccessor<EntityStore> var4)
- public void resetInternalState()
- public void preExecutionModifyBrushConfig(BrushConfigCommandExecutor brushConfigCommandExecutor, int operationIndex)
- @Nonnull public <T> BrushOperationSetting<T> createBrushSetting(@Nonnull String name, String description, T defaultValue, ArgumentType<T> argumentType)
- @Nonnull public <T> BrushOperationSetting<T> createBrushSetting(@Nonnull String name, String description, T defaultValue, ArgumentType<T> argumentType, Function<BrushOperationSetting<T>, String> toStringFunction)
- public String getName()
- public String getDescription()
- @Nonnull public Map<String, BrushOperationSetting<?>> getRegisteredOperationSettings()
