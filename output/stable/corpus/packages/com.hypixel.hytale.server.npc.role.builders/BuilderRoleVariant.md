# BuilderRoleVariant

Type: class | Package: com.hypixel.hytale.server.npc.role.builders

public class BuilderRoleVariant

Builder for role variants that reference and modify an existing parent role definition.

Also in this package: BuilderRole, BuilderRoleAbstract

Complete API:
  public Role build(BuilderSupport builderSupport)
  public StateMappingHelper getStateMappingHelper()
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public Builder<Role> readConfig(JsonElement data)
  public Class<Role> category()
  public String getIdentifier()
  public SpawnTestResult canSpawn(SpawningContext spawningContext)
  public String getSpawnModelName(ExecutionContext context, Scope modifierScope)
  public Scope createModifierScope(ExecutionContext executionContext)
  public Scope createExecutionScope()
  public void markNeedsReload()
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public final boolean isEnabled(ExecutionContext context)
  public int getReferenceIndex()
  public boolean isMemory(ExecutionContext context, Scope modifierScope)
  public String getMemoriesCategory(ExecutionContext context, Scope modifierScope)
  public String getMemoriesNameOverride(ExecutionContext context, Scope modifierScope)
  public String getNameTranslationKey(ExecutionContext context, Scope modifierScope)
  protected V executeOnSuperRole(BuilderSupport builderSupport, BiFunction<Builder<Role>,BuilderSupport,V> func, Supplier<V> failed)
  protected V executeOnSuperRole(SpawningContext spawningContext, BiFunction<Builder<Role>,SpawningContext,V> func, Supplier<V> failed)
  protected V executeOnSuperRole(ExecutionContext context, Scope modifierScope, TriFunction<Builder<Role>,ExecutionContext,Scope,V> func, Supplier<V> failed)
  protected int executeOnSuperRole(ExecutionContext context, Scope modifierScope, TriToIntFunction<Builder<Role>,ExecutionContext,Scope> func, int failed)

Fields:
protected final StringHolder reference
protected int referenceIndex
protected BuilderModifier modifier
