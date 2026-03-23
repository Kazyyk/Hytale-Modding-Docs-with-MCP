# SensorValueProviderWrapper

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.utility

public class SensorValueProviderWrapper

Sensor that wraps a value provider, mapping its output to sensor parameters.

Also in this package: ActionNothing, ActionRandom, ActionResetInstructions, ActionSequence, ActionSetFlag, ActionTimeout, BodyMotionNothing, BodyMotionSequence, HeadMotionNothing, HeadMotionSequence, MotionSequence, SensorAdjustPosition, SensorAnd, SensorAny, SensorEval, SensorFlag, SensorMany, SensorNot, SensorOr, SensorRandom (and 1 more)

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()
  public void registerWithSupport(Role role)
  public void motionControllerChanged(Ref<EntityStore> ref, NPCEntity npcComponent, MotionController motionController, ComponentAccessor<EntityStore> componentAccessor)
  public void loaded(Role role)
  public void spawned(Role role)
  public void unloaded(Role role)
  public void removed(Role role)
  public void teleported(Role role, World from, World to)
  public void done()
  public int componentCount()
  public IAnnotatedComponent getComponent(int index)
  public void setContext(IAnnotatedComponent parent, int index)

Fields:
protected static final IntObjectPair<?>[] EMPTY_ARRAY
protected final Sensor sensor
protected final boolean passValues
protected final IntObjectPair<SingleStringParameterProvider>[] stringParameterProviders
protected final IntObjectPair<SingleIntParameterProvider>[] intParameterProviders
protected final IntObjectPair<SingleDoubleParameterProvider>[] doubleParameterProviders
protected final ValueWrappedInfoProvider infoProvider
protected final MultipleParameterProvider multipleParameterProvider
protected final ComponentType<EntityStore,ValueStore> valueStoreComponentType
