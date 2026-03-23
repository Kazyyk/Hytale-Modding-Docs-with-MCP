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

Also in this package: Builder, BuilderAssetMonitorHandler, BuilderAttributeDescriptor, BuilderBase, BuilderBaseWithType, BuilderCodecObjectHelper, BuilderCombatConfig, BuilderComponent, BuilderContext, BuilderDescriptor, BuilderDescriptorState, BuilderFactory, BuilderInfo, BuilderManager, BuilderModifier, BuilderObjectArrayHelper, BuilderObjectHelper, BuilderObjectListHelper, BuilderObjectMapHelper, BuilderObjectReferenceHelper (and 28 more)

Complete API:
  public boolean isDisallowParameterProviders()
  public void add(ProviderEvaluator evaluator)
  public boolean canAddProvider()
  public FeatureEvaluatorHelper lock()
  public void setContainsReference()
  public void addProviderReferenceValidator(BiConsumer<BuilderManager,ExecutionContext> referenceValidator)
  public void addComponentRequirementValidator(BiConsumer<FeatureEvaluatorHelper,ExecutionContext> validator)
  public List<ProviderEvaluator> getProviders()
  public boolean requiresProviderReferenceEvaluation()
  public boolean belongsToFeatureRequiringComponent()
  public void validateProviderReferences(BuilderManager manager, ExecutionContext context)
  public void validateComponentRequirements(FeatureEvaluatorHelper providers, ExecutionContext context)
  public void disallowParameterProviders()

Fields:
private List<ProviderEvaluator> evaluators
private List<BiConsumer<BuilderManager,ExecutionContext>> providerReferenceValidators
private List<BiConsumer<FeatureEvaluatorHelper,ExecutionContext>> componentRequirementValidators
private boolean locked
private boolean containsProviderReference
private boolean isFeatureRequiringComponent
private boolean disallowParameterProviders
