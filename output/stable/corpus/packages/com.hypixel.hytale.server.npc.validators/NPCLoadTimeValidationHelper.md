# NPCLoadTimeValidationHelper

Type: class | Package: com.hypixel.hytale.server.npc.validators

public class NPCLoadTimeValidationHelper

## Fields

- private final String fileName
- private final Model spawnModel
- private final boolean isAbstract
- private final HashSet<String> evaluatedAnimations
- private final Set<Class<? extends MotionController>> providedMotionControllers
- private final Set<Class<? extends MotionController>> requiredMotionControllers
- private final ArrayDeque<HashSet<String>> seenFilterStack
- private final ValueStoreValidator valueStoreValidator
- private Set<String> prioritiserProvidedFilterTypes
- private int inventorySize
- private int hotbarSize
- private int offHandSize
- private boolean parentSensorOnce
- private boolean isVariant
- private final ArrayDeque<String> stateStack

## Methods

- public void setInventorySizes(int inventorySize, int hotbarSize, int offHandSize)
- public Model getSpawnModel()
- public boolean isAbstract()
- public boolean isParentSensorOnce()
- public void updateParentSensorOnce(boolean parentSensorOnce)
- public void clearParentSensorOnce()
- public void setIsVariant()
- public boolean isVariant()
- @Nonnull public ValueStoreValidator getValueStoreValidator()
- @Nullable public String getCurrentStateName()
- public void pushCurrentStateName(String currentStateName)
- public void popCurrentStateName()
- public void validateAnimation(String animation)
- public void registerMotionControllerType(Class<? extends MotionController> clazz)
- public void requireMotionControllerType(Class<? extends MotionController> clazz)
- public boolean validateMotionControllers(List<String> errors)
- public boolean validateInventoryHasSlot(int slot, String context, List<String> errors)
- public boolean validateHotbarHasSlot(int slot, String context, List<String> errors)
- public boolean validateOffHandHasSlot(int slot, String context, List<String> errors)
- public void pushFilterSet()
- public void popFilterSet()
- public boolean hasSeenFilter(String filter)
- public void setPrioritiserProvidedFilterTypes(Set<String> prioritiserProvidedFilterTypes)
- public boolean isFilterExternallyProvided(String filter)
- public void clearPrioritiserProvidedFilterTypes()
