# RotateOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.transforms | Extends: SequenceBrushOperation

public class RotateOperation extends SequenceBrushOperation

Sequential brush operation that applies a rotation transform to the brush shape. Configurable by axis (`BrushAxis`), angle (`Rotation`), and origin (`OffsetCenter`, `ClickCenter`, or `Player` position).

Also in this package: RotationOrigin

Complete API:
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)

Fields:
private static final HytaleLogger LOGGER
public static final BuilderCodec<RotateOperation> CODEC
public Rotation rotationAngleArg
public BrushAxis rotationAxisArg
public RotateOperation.RotationOrigin rotationOriginArg
