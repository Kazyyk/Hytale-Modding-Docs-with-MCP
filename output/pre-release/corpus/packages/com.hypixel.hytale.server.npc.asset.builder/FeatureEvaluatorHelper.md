# FeatureEvaluatorHelper

Type: class | Package: com.hypixel.hytale.server.npc.asset.builder

public class FeatureEvaluatorHelper

Manages feature provider evaluation for builders. Tracks a list of provider evaluators, supports locking (making the list immutable), and validates that referenced features are provided and component requirements are met. Used to ensure that actions and motions in the NPC behavior tree have access to the target types they need (Player, NPC, Position, etc.).

## Constructors


public FeatureEvaluatorHelper()
public FeatureEvaluatorHelper(boolean couldRequireFeature)

## Methods

### add


public void add(ProviderEvaluator evaluator)

Adds a provider evaluator. Must be called before `lock()`.

### canAddProvider


public boolean canAddProvider()

Returns `true` if the helper has not been locked.

### lock


@Nonnull
public FeatureEvaluatorHelper lock()

Makes the evaluator list immutable and returns `this`.

### setContainsReference


public void setContainsReference()

Marks that this helper contains a provider reference that needs deferred validation.

### getProviders


@Nonnull
public List<ProviderEvaluator> getProviders()

### validateProviderReferences


public void validateProviderReferences(BuilderManager manager, ExecutionContext context)

Validates all registered provider reference validators.

### validateComponentRequirements


public void validateComponentRequirements(FeatureEvaluatorHelper providers, ExecutionContext context)

Validates that all component requirements are satisfied by the given providers.

### addProviderReferenceValidator / addComponentRequirementValidator


public void addProviderReferenceValidator(BiConsumer<BuilderManager, ExecutionContext> referenceValidator)
public void addComponentRequirementValidator(BiConsumer<FeatureEvaluatorHelper, ExecutionContext> validator)

### disallowParameterProviders / isDisallowParameterProviders


public void disallowParameterProviders()
public boolean isDisallowParameterProviders()

## Related Types

- Feature -- the feature enum
- Builder -- `getEvaluatorHelper()` returns this type
- BuilderValidationHelper -- carries this helper
