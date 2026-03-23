# CircleOffsetFromArgOperation

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.flowcontrol.loops

public class CircleOffsetFromArgOperation

Circle offset from argument operation.

Also in this package: CircleOffsetAndLoopOperation, LoadLoopFromToolArgOperation, LoopOperation, LoopRandomOperation

Complete API:
  public void resetInternalState()
  private int doubleToNearestInt(double number)
  public void modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)

Fields:
public static final int MAX_REPETITIONS
public static final int IDLE_STATE
public static final double TWO_PI
public static final BuilderCodec<CircleOffsetFromArgOperation> CODEC
public String indexNameArg
public String numCirclePointsArg
private int numCirclePointsArgVal
public String circleRadiusArg
private int circleRadiusArgVal
private int previousCirclePointsVal
private int previousCircleRadiusVal
public boolean flipArg
public boolean rotateArg
private int repetitionsRemaining
private List<Vector3i> offsetsInCircle
private Vector3i offsetWhenFirstReachedOperation
private Vector3i previousCircleOffset
