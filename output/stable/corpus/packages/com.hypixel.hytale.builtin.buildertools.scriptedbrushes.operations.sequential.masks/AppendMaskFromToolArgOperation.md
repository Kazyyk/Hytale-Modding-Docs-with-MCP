# AppendMaskFromToolArgOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.masks | Extends: SequenceBrushOperation

public class AppendMaskFromToolArgOperation extends SequenceBrushOperation

## Fields

- public static final BuilderCodec<AppendMaskFromToolArgOperation> CODEC
- @Nonnull public String argNameArg
- @Nonnull public boolean invertArg
- @Nonnull public BlockFilter.FilterType filterTypeArg
- @Nullable public String additionalBlocksArg

## Constructors

- public AppendMaskFromToolArgOperation()

## Methods

- @Override public void modifyBrushConfig(@Nonnull Ref<EntityStore> ref,
        @Nonnull BrushConfig brushConfig,
        @Nonnull BrushConfigCommandExecutor brushConfigCommandExecutor,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |

Also in this package: AppendMaskOperation, HistoryMaskOperation, MaskOperation, UseBrushMaskOperation, UseOperationMaskOperation

Complete API:
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final BuilderCodec<AppendMaskFromToolArgOperation> CODEC
public String argNameArg
public boolean invertArg
public BlockFilter.FilterType filterTypeArg
public String additionalBlocksArg
