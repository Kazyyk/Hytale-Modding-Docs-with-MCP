# CircleOffsetAndLoopOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.flowcontrol.loops

public class CircleOffsetAndLoopOperation

Circle offset and loop operation for scripted brushes.

Also in this package: CircleOffsetFromArgOperation, LoadLoopFromToolArgOperation, LoopOperation, LoopRandomOperation

Complete API:
  public void resetInternalState()
  private int doubleToNearestInt(double number)
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final int MAX_REPETITIONS
public static final int IDLE_STATE
public static final double TWO_PI
public static final BuilderCodec<CircleOffsetAndLoopOperation> CODEC
public String indexNameArg
public Integer numberOfCirclePointsArg
public Integer circleRadiusArg
public boolean flipArg
public boolean rotateArg
private int repetitionsRemaining
private List<Vector3i> offsetsInCircle
private Vector3i offsetWhenFirstReachedOperation
private Vector3i previousCircleOffset
