package com.restaurant.web;

public class RecipeResource {

//    private final JpaHelper jpaHelper;
//
//    @Inject
//    public RecipeResource(JpaHelper jpaHelper) {
//        this.jpaHelper = jpaHelper;
//    }
//
//
//    public Response createRecipe(final Long accountId, final Recipe recipe) throws HttpException {
//        if (!jpaHelper.isLoggedIn(accountId)) {
//            return buildResponse(UNAUTHORIZED, new ErrorType("Login expired, please login again."));
//        }
//
//        final Long recipeId = jpaHelper.executeJpaTransaction(new ThrowingFunction1<Long, EntityManager, HttpException>() {
//            @Override
//            public Long apply(EntityManager em) throws HttpException {
//                recipe.setAccount(em.getReference(Account.class, accountId));
//                em.persist(recipe);
//                em.flush();
//                return recipe.getId();
//            }
//        });
//
//        if (null == recipeId) {
//            return buildResponse(BAD_REQUEST, new ErrorType("Unable to create recipe."));
//        }
//
//        return buildResponse(OK, new Recipe().withId(recipeId));
//    }
//
//    public Response loadRecipes(final Long accountId, final String name, final Long recipeId) throws HttpException {
//        if (!jpaHelper.isLoggedIn(accountId)) {
//            return buildResponse(UNAUTHORIZED, new ErrorType("Login expired, please login again."));
//        }
//
//        final List<Recipe> recipes = jpaHelper.executeJpa(new ThrowingFunction1<List<Recipe>, EntityManager, HttpException>() {
//            @Override
//            public List<Recipe> apply(EntityManager em) throws HttpException {
//                final TypedQuery<Recipe> query;
//                if (null != recipeId) {
//                    query = em.createQuery("select a from Recipe a where (a.accountId = :accountId or a.account.isShareAccount = true) and a.id = :id", Recipe.class);
//                    query.setParameter("accountId", accountId);
//                    query.setParameter("id", recipeId);
//                } else if (!isNullOrEmpty(name)) {
//                    query = em.createQuery("select a from Recipe a where (a.accountId = :accountId or a.account.isShareAccount = true) and a.name LIKE :name", Recipe.class);
//                    query.setParameter("accountId", accountId);
//                    query.setParameter("name", name);
//                } else {
//                    query = em.createQuery("select a from Recipe a where a.accountId = :accountId or a.account.isShareAccount = true", Recipe.class);
//                    query.setParameter("accountId", accountId);
//                }
//                return query.getResultList();
//            }
//        });
//        if (MoreCollections.isNullOrEmpty(recipes)) {
//            return buildResponse(NO_CONTENT, new ErrorType("Recipes not found"));
//        }
//        for (Recipe recipe : recipes) {
//            recipe.clean();
//        }
//        return buildResponse(OK, recipes);
//    }
//
//    public Response updateRecipe(final Long accountId, final Long recipeId, final Recipe recipe) throws HttpException {
//        if (!jpaHelper.isLoggedIn(accountId)) {
//            return buildResponse(UNAUTHORIZED, new ErrorType("Login expired, please login again."));
//        }
//
//        jpaHelper.executeJpaTransaction(new ThrowingFunction1<Recipe, EntityManager, HttpException>() {
//            @Override
//            public Recipe apply(EntityManager em) throws HttpException {
//                final Recipe forUpdate = em.find(Recipe.class, recipeId);
//                em.refresh(forUpdate, PESSIMISTIC_WRITE);
//                forUpdate
//                        .withName(isNullOrEmpty(recipe.getName()) ? forUpdate.getName() : recipe.getName())
//                        .withDescription(null == recipe.getDescription() ? forUpdate.getDescription() : recipe.getDescription())
//                        .withCaloriesConsumed(null == recipe.getCaloriesConsumed() ? forUpdate.getCaloriesConsumed() : recipe.getCaloriesConsumed());
//                return forUpdate;
//            }
//        });
//        return buildResponse(OK);
//    }
//
//    public Response deleteRecipe(final Long accountId, final Long recipeId) throws HttpException {
//        if (!jpaHelper.isLoggedIn(accountId)) {
//            return buildResponse(UNAUTHORIZED, new ErrorType("Login expired, please login again."));
//        }
//
//        jpaHelper.executeJpaTransaction(new ThrowingFunction1<Long, EntityManager, HttpException>() {
//            @Override
//            public Long apply(EntityManager em) throws HttpException {
//                em.remove(em.find(Recipe.class, recipeId));
//                return null;
//            }
//        });
//        return buildResponse(NO_CONTENT);
//    }
}
