package com.cgi.nl.util.test;

public class TestConstantsUtil {

    public final static String WARN_LOG_INFO = "{\n" +
            "    \"logType\": \"WARN\",\n" +
            "    \"logDataList\": [\n" +
            "        {\n" +
            "            \"logName\": \"Node:\",\n" +
            "            \"logMessage\": \"[127.0.0.1]:5701 [dev] [3.2.5] No join method is enabled! Starting standalone.\",\n" +
            "            \"logCount\": 10\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"AnnotationConfigEmbeddedWebApplicationContext:\",\n" +
            "            \"logMessage\": \"Exception encountered during context initialization - cancelling refresh attempt\",\n" +
            "            \"logCount\": 3\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    public static final String ERROR_LOG_INFO = "{\n" +
            "    \"logType\": \"ERROR\",\n" +
            "    \"logDataList\": [\n" +
            "        {\n" +
            "            \"logName\": \"java.lang.NullPointerException:\",\n" +
            "            \"logMessage\": \"Exception in com.fluentgrid.repapp.web.rest.EventsResource.search() with cause = null java.lang.NullPointerException: null\",\n" +
            "            \"logCount\": 10\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"org.springframework.beans.factory.BeanCreationException\",\n" +
            "            \"logMessage\": \"Error starting Tomcat context: org.springframework.beans.factory.BeanCreationException\",\n" +
            "            \"logCount\": 3\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"org.springframework.boot.context.embedded.EmbeddedServletContainerException:\",\n" +
            "            \"logMessage\": \"Application startup failed org.springframework.context.ApplicationContextException: Unable to start embedded container; nested exception is org.springframework.boot.context.embedded.EmbeddedServletContainerException: Unable to start embedded Tomcat\",\n" +
            "            \"logCount\": 3\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"liquibase.exception.ChangeLogParseException:\",\n" +
            "            \"logMessage\": \"Error thrown as a SAXException: Error Reading Migration File: class path resource [config/liquibase/changelog/20150819112214_added_entity_EventTypes.xml] cannot be resolved to URL because it does not exist liquibase.exception.ChangeLogParseException: Error Reading Migration File: class path resource [config/liquibase/changelog/20150819112214_added_entity_EventTypes.xml] cannot be resolved to URL because it does not exist\",\n" +
            "            \"logCount\": 1\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    public static final String PLAIN_RICE_ING_JSON = "[\n" +
            "    {\n" +
            "        \"title\": \"Plain Rice --  Make Ahead OAMC Throw It in the Freezer!!\",\n" +
            "        \"href\": \"http://www.recipezaar.com/Plain-Rice-Make-Ahead-OAMC-Throw-It-in-the-Freezer-159839\",\n" +
            "        \"ingredients\": [\n" +
            "            \"rice\",\n" +
            "            \"water\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/45331.jpg\"\n" +
            "    }\n" +
            "]";
    public static final String ALL_RECIPES_JSON = "[\n" +
            "    {\n" +
            "        \"title\": \"Barbecued Grilled Portobello Sandwich\",\n" +
            "        \"href\": \"http://www.kraftfoods.com/kf/recipes/barbecued-grilled-portobello-sandwich-53215.aspx\",\n" +
            "        \"ingredients\": [\n" +
            "            \"mushrooms\",\n" +
            "            \"barbecue sauce\",\n" +
            "            \"sandwich rolls\",\n" +
            "            \"lettuce\",\n" +
            "            \"tomato\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/646777.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Barbecued Grilled Portobello Sandwich\",\n" +
            "        \"href\": \"http://www.kraftfoods.com/kf/recipes/barbecued-grilled-portobello-sandwich-53215.aspx?cm_re=1-_-1-_-RecipeAlsoEnjoy\",\n" +
            "        \"ingredients\": [\n" +
            "            \"mushrooms\",\n" +
            "            \"barbecue sauce\",\n" +
            "            \"sandwich rolls\",\n" +
            "            \"lettuce\",\n" +
            "            \"tomato\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/675080.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Beef & Portobello Mushroom Stroganoff\",\n" +
            "        \"href\": \"http://www.eatingwell.com/recipes/beef_mush_stroganoff.html\",\n" +
            "        \"ingredients\": [\n" +
            "            \"mushrooms\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/693392.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Blue Ribbon Meatloaf\",\n" +
            "        \"href\": \"http://www.eatingwell.com/recipes/meatloaf.html\",\n" +
            "        \"ingredients\": [\n" +
            "            \"onions\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/694321.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Boiled Ham\",\n" +
            "        \"href\": \"http://www.recipezaar.com/Boiled-Ham-11162\",\n" +
            "        \"ingredients\": [\n" +
            "            \"ham\",\n" +
            "            \"onions\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/182730.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Broccoli Casserole Recipe\",\n" +
            "        \"href\": \"http://cookeatshare.com/recipes/broccoli-casserole-59082\",\n" +
            "        \"ingredients\": [\n" +
            "            \"onions\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/780513.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Bruschetta With Roasted Garlic and Cherry Tomatoes\",\n" +
            "        \"href\": \"http://www.recipezaar.com/Bruschetta-With-Roasted-Garlic-and-Cherry-Tomatoes-244281\",\n" +
            "        \"ingredients\": [\n" +
            "            \"garlic\",\n" +
            "            \"italian bread\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/199304.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Bryannas Vegan Dulce De Leche Recipe\",\n" +
            "        \"href\": \"http://www.grouprecipes.com/20337/bryannas-vegan-dulce-de-leche.html\",\n" +
            "        \"ingredients\": [\n" +
            "            \"rice\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/419291.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Cheesy Hot Dog Rice\",\n" +
            "        \"href\": \"http://www.kraftfoods.com/kf/recipes/cheesy-hot-dog-rice-70061.aspx\",\n" +
            "        \"ingredients\": [\n" +
            "            \"rice\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/632043.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Chicken Salad With Rice Noodles\",\n" +
            "        \"href\": \"http://www.recipezaar.com/Chicken-Salad-With-Rice-Noodles-250925\",\n" +
            "        \"ingredients\": [\n" +
            "            \"rice\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/298452.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Chicken With Orange Sauce Recipe\",\n" +
            "        \"href\": \"http://cookeatshare.com/recipes/chicken-with-orange-sauce-33954\",\n" +
            "        \"ingredients\": [\n" +
            "            \"rice\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/723895.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Creamy Scrambled Eggs Recipe Recipe\",\n" +
            "        \"href\": \"http://www.grouprecipes.com/43522/creamy-scrambled-eggs-recipe.html\",\n" +
            "        \"ingredients\": [\n" +
            "            \"onions\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/373064.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Crock Pot Caramelized Onions\",\n" +
            "        \"href\": \"http://www.recipezaar.com/Crock-Pot-Caramelized-Onions-191625\",\n" +
            "        \"ingredients\": [\n" +
            "            \"butter\",\n" +
            "            \"onions\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/338845.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Elaines Economical Beef Wellington Recipe\",\n" +
            "        \"href\": \"http://www.grouprecipes.com/77054/elaines-economical-beef-wellington.html\",\n" +
            "        \"ingredients\": [\n" +
            "            \"bacon\",\n" +
            "            \"eggs\",\n" +
            "            \"mustard\",\n" +
            "            \"mushrooms\",\n" +
            "            \"pastry\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/203407.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Flatbread With Za?atar\",\n" +
            "        \"href\": \"http://www.recipezaar.com/Flatbread-With-Zaatar-178010\",\n" +
            "        \"ingredients\": [\n" +
            "            \"garlic\",\n" +
            "            \"pita bread\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/567386.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Fresh Vegetable Spring Rolls\",\n" +
            "        \"href\": \"http://www.recipezaar.com/Fresh-Vegetable-Spring-Rolls-129110\",\n" +
            "        \"ingredients\": [\n" +
            "            \"rice\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/581601.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Garlic Butter for Steaks and Mash Potatoes\",\n" +
            "        \"href\": \"http://www.recipezaar.com/garlic-butter-for-steaks-and-mash-potatoes-358993\",\n" +
            "        \"ingredients\": [\n" +
            "            \"butter\",\n" +
            "            \"garlic\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/642047.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Garlic Croutons\",\n" +
            "        \"href\": \"http://allrecipes.com/Recipe/Garlic-Croutons/Detail.aspx\",\n" +
            "        \"ingredients\": [\n" +
            "            \"butter\",\n" +
            "            \"garlic\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/19040.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Garlic Dijon Grilling Sauce\",\n" +
            "        \"href\": \"http://www.kraftfoods.com/kf/recipes/garlic-dijon-grilling-sauce-56449.aspx\",\n" +
            "        \"ingredients\": [\n" +
            "            \"garlic\",\n" +
            "            \"dijon mustard\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/631164.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Garlic Vinegar\",\n" +
            "        \"href\": \"http://www.recipezaar.com/Garlic-Vinegar-251602\",\n" +
            "        \"ingredients\": [\n" +
            "            \"garlic\",\n" +
            "            \"vinegar\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/647882.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Green Bean Casserole\",\n" +
            "        \"href\": \"http://www.eatingwell.com/recipes/healthy_green_bean_casserole.html\",\n" +
            "        \"ingredients\": [\n" +
            "            \"onions\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/707237.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Grilled Chipotle Salmon With Pineapple Cilantro Rice\",\n" +
            "        \"href\": \"http://www.recipezaar.com/Grilled-Chipotle-Salmon-With-Pineapple-Cilantro-Rice-128564\",\n" +
            "        \"ingredients\": [\n" +
            "            \"salmon\",\n" +
            "            \"onions\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/715159.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Grilled Portabello Sandwich\",\n" +
            "        \"href\": \"http://www.kraftfoods.com/kf/recipes/grilled-portabello-sandwich-75214.aspx\",\n" +
            "        \"ingredients\": [\n" +
            "            \"mushrooms\",\n" +
            "            \"red onions\",\n" +
            "            \"italian dressing\",\n" +
            "            \"sandwich rolls\",\n" +
            "            \"mayonaise\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/652027.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Grilled Portobello Mushrooms\",\n" +
            "        \"href\": \"http://allrecipes.com/Recipe/Grilled-Portobello-Mushrooms/Detail.aspx\",\n" +
            "        \"ingredients\": [\n" +
            "            \"balsamic vinegar\",\n" +
            "            \"vegetable oil\",\n" +
            "            \"garlic\",\n" +
            "            \"onions\",\n" +
            "            \"mushrooms\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/16270.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Hand-Rolled Sushi\",\n" +
            "        \"href\": \"http://find.myrecipes.com/recipes/recipefinder.dyn?action=displayRecipe&recipe_id=1027058\",\n" +
            "        \"ingredients\": [\n" +
            "            \"rice\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/514061.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Kittencal's Do-Ahead Garlic\",\n" +
            "        \"href\": \"http://www.recipezaar.com/Kittencals-Do-Ahead-Garlic-73596\",\n" +
            "        \"ingredients\": [\n" +
            "            \"garlic\",\n" +
            "            \"vegetable oil\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/40503.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Maki Rolls\",\n" +
            "        \"href\": \"http://find.myrecipes.com/recipes/recipefinder.dyn?action=displayRecipe&recipe_id=1027056\",\n" +
            "        \"ingredients\": [\n" +
            "            \"rice\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/541137.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Marinated Portobello Mushrooms\",\n" +
            "        \"href\": \"http://allrecipes.com/Recipe/Marinated-Portobello-Mushrooms/Detail.aspx\",\n" +
            "        \"ingredients\": [\n" +
            "            \"balsamic vinegar\",\n" +
            "            \"rosemary\",\n" +
            "            \"olive oil\",\n" +
            "            \"mushrooms\",\n" +
            "            \"salt\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/16272.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Pear and Sausage Risotto\",\n" +
            "        \"href\": \"http://www.bigoven.com/172834-Pear-and-Sausage-Risotto-recipe.html\",\n" +
            "        \"ingredients\": [\n" +
            "            \"olive oil\",\n" +
            "            \"red onions\",\n" +
            "            \"garlic\",\n" +
            "            \"pancetta\",\n" +
            "            \"mushrooms\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/636742.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Plain Rice --  Make Ahead OAMC Throw It in the Freezer!!\",\n" +
            "        \"href\": \"http://www.recipezaar.com/Plain-Rice-Make-Ahead-OAMC-Throw-It-in-the-Freezer-159839\",\n" +
            "        \"ingredients\": [\n" +
            "            \"rice\",\n" +
            "            \"water\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/45331.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Portobello Mushroom Sauce\",\n" +
            "        \"href\": \"http://allrecipes.com/Recipe/Portobello-Mushroom-Sauce/Detail.aspx\",\n" +
            "        \"ingredients\": [\n" +
            "            \"butter\",\n" +
            "            \"heavy cream\",\n" +
            "            \"port wine\",\n" +
            "            \"mushrooms\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/24124.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Pulled Chicken Sandwiches (Crock Pot)\",\n" +
            "        \"href\": \"http://www.recipezaar.com/Pulled-Chicken-Sandwiches-Crock-Pot-242547\",\n" +
            "        \"ingredients\": [\n" +
            "            \"chicken\",\n" +
            "            \"onions\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/107122.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Rice Sandwich\",\n" +
            "        \"href\": \"http://www.nibbledish.com/people/wokkingmum/recipes/rice-sandwich\",\n" +
            "        \"ingredients\": [\n" +
            "            \"rice\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/516214.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Roast Chicken with Rosemary\",\n" +
            "        \"href\": \"http://allrecipes.com/Recipe/Roast-Chicken-with-Rosemary/Detail.aspx\",\n" +
            "        \"ingredients\": [\n" +
            "            \"onions\",\n" +
            "            \"salt\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/18294.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Roasted Garlic\",\n" +
            "        \"href\": \"http://allrecipes.com/Recipe/Roasted-Garlic/Detail.aspx\",\n" +
            "        \"ingredients\": [\n" +
            "            \"garlic\",\n" +
            "            \"olive oil\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/30536.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Roasted Portobello Mushrooms with Blue Cheese\",\n" +
            "        \"href\": \"http://allrecipes.com/Recipe/Roasted-Portobello-Mushrooms-with-Blue-Cheese/Detail.aspx\",\n" +
            "        \"ingredients\": [\n" +
            "            \"black pepper\",\n" +
            "            \"blue cheese\",\n" +
            "            \"mushrooms\",\n" +
            "            \"soy sauce\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/7179.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Romano Cheese Crisp\",\n" +
            "        \"href\": \"http://allrecipes.com/Recipe/Romano-Cheese-Crisp/Detail.aspx\",\n" +
            "        \"ingredients\": [\n" +
            "            \"garlic\",\n" +
            "            \"romano cheese\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/9493.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Spaghetti with Clams & Corn\",\n" +
            "        \"href\": \"http://www.eatingwell.com/recipes/spaghetti_clams_corn.html\",\n" +
            "        \"ingredients\": [\n" +
            "            \"onions\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/698569.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"White Bean Spread With Garlic & Rosemary\",\n" +
            "        \"href\": \"http://allrecipes.com/Recipe/White-Bean-Spread-With-Garlic--Rosemary/Detail.aspx\",\n" +
            "        \"ingredients\": [\n" +
            "            \"garlic\",\n" +
            "            \"olive oil\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/2268.jpg\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"title\": \"Zucchini Rice Casserole\",\n" +
            "        \"href\": \"http://www.eatingwell.com/recipes/zucchini_rice_casserole.html\",\n" +
            "        \"ingredients\": [\n" +
            "            \"rice\"\n" +
            "        ],\n" +
            "        \"thumbnail\": \"http://img.recipepuppy.com/697402.jpg\"\n" +
            "    }\n" +
            "]";

    public static final String INFO_LOG_DATA = "{\n" +
            "    \"logType\": \"INFO\",\n" +
            "    \"logDataList\": [\n" +
            "        {\n" +
            "            \"logName\": \"PaymentService:\",\n" +
            "            \"logMessage\": \"payment observers size 4\",\n" +
            "            \"logCount\": 28\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"LifecycleService:\",\n" +
            "            \"logMessage\": \"[127.0.0.1]:5701 [dev] [3.2.5] Address[127.0.0.1]:5701 is STARTING\",\n" +
            "            \"logCount\": 26\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"Application:\",\n" +
            "            \"logMessage\": \"Starting Application on phxdabs56 with PID 6184 (E:\\\\FluentGrid\\\\WorkingCopy\\\\REP\\\\target\\\\classes started by Sekhar in E:\\\\FluentGrid\\\\WorkingCopy\\\\REP)\",\n" +
            "            \"logCount\": 24\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"system:\",\n" +
            "            \"logMessage\": \"[127.0.0.1]:5701 [dev] [3.2.5] Hazelcast 3.2.5 (20140814) starting at Address[127.0.0.1]:5701\",\n" +
            "            \"logCount\": 20\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"WebConfigurer:\",\n" +
            "            \"logMessage\": \"Web application configuration, using profiles: [dev]\",\n" +
            "            \"logCount\": 14\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"HealthMonitor:\",\n" +
            "            \"logMessage\": \"[127.0.0.1]:5701 [dev] [3.2.5] memory.used=138.2M, memory.free=191.8M, memory.total=330.0M, memory.max=1.8G, memory.used/total=41.87%, memory.used/max=7.67%, load.process=-100.00%, load.system=92.00%, load.systemAverage=-100.00%, thread.count=28, thread.peakCount=28, event.q.size=0, executor.q.async.size=0, executor.q.client.size=0, executor.q.operation.size=0, executor.q.query.size=0, executor.q.scheduled.size=0, executor.q.io.size=0, executor.q.system.size=0, executor.q.operation.size=0, executor.q.priorityOperation.size=0, executor.q.response.size=0, operations.remote.size=0, operations.running.size=0, proxy.count=0, clientEndpoint.count=0, connection.active.count=0, connection.count=0\",\n" +
            "            \"logCount\": 14\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"MetricsConfiguration:\",\n" +
            "            \"logMessage\": \"Initializing Metrics JMX reporting\",\n" +
            "            \"logCount\": 10\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"DefaultAddressPicker:\",\n" +
            "            \"logMessage\": \"null [dev] [3.2.5] Picked Address[127.0.0.1]:5701, using socket ServerSocket[addr=/0:0:0:0:0:0:0:0,localport=5701], bind any local is true\",\n" +
            "            \"logCount\": 10\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"HazelcastCacheRegionFactory:\",\n" +
            "            \"logMessage\": \"Starting up HazelcastCacheRegionFactory\",\n" +
            "            \"logCount\": 7\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"ThymeleafConfiguration:\",\n" +
            "            \"logMessage\": \"loading non-reloadable mail messages resources\",\n" +
            "            \"logCount\": 7\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"CacheConfiguration:\",\n" +
            "            \"logMessage\": \"Remove Cache Manager metrics\",\n" +
            "            \"logCount\": 6\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"EnrolResource:\",\n" +
            "            \"logMessage\": \"enrolDTO-EnrolDTO{esiid='1008901006900889980114', firstName='safadfasf', lastName='kjlkjljlk', email='sdfds@sdfd.com', servAdd='AddressDTO{address='5404 JONATHAN LN', city='HOUSTON', state='TX', zipcode='77011'}', billAdd='null'}\",\n" +
            "            \"logCount\": 5\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"initializer:\",\n" +
            "            \"logMessage\": \"[127.0.0.1]:5701 [dev] [3.2.5] Destroying node initializer.\",\n" +
            "            \"logCount\": 3\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"Node:\",\n" +
            "            \"logMessage\": \"[127.0.0.1]:5701 [dev] [3.2.5] Hazelcast Shutdown is completed in 16 ms.\",\n" +
            "            \"logCount\": 3\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"ConnectCheckTransaction:\",\n" +
            "            \"logMessage\": \"&NETCONNECT_TRANSACTION=<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\" standalone=\\\"no\\\"?><NetConnectRequest xmlns=\\\"http://www.experian.com/NetConnect\\\" xmlns:xsi=\\\"http://www.w3.org/2001/XMLSchema-instance\\\" xsi:schemaLocation=\\\"http://www.experian.com/NetConnect NetConnect.xsd\\\"> <EAI>JOKMYOZW</EAI><DBHost>STAR</DBHost><ReferenceId>20153110200977</ReferenceId><Request xmlns=\\\"http://www.experian.com/WebDelivery\\\" version=\\\"1.0\\\"> <Products><ConnectCheck><Subscriber><Preamble>TEST</Preamble><OpInitials>TN</OpInitials><SubCode>5991712</SubCode></Subscriber><PrimaryApplicant><Name><Surname>HELEN</Surname><First>WILLIE</First></Name><SSN>666438798</SSN><CurrentAddress> <Street>1202 AURORA ST</Street> <City>HOUSTON</City> <State>TX</State> <Zip>77009</Zip> </CurrentAddress> <YOB>1956</YOB></PrimaryApplicant><OutputType> <ARF>  <ARFVersion>06</ARFVersion> </ARF></OutputType><Vendor> <VendorNumber>577</VendorNumber> </Vendor><Options> <ReferenceNumber>20153110200977</ReferenceNumber><EndUser>admin</EndUser> </Options></ConnectCheck> </Products></Request></NetConnectRequest>\",\n" +
            "            \"logCount\": 2\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"HttpClient:\",\n" +
            "            \"logMessage\": \"Use Proxy: 'false'\",\n" +
            "            \"logCount\": 1\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    public static final String DEBUG_LOG_INFO = "{\n" +
            "    \"logType\": \"DEBUG\",\n" +
            "    \"logDataList\": [\n" +
            "        {\n" +
            "            \"logName\": \"LoggingAspect:\",\n" +
            "            \"logMessage\": \"Enter: com.fluentgrid.repapp.service.PaymentService.reigsterObserver() with argument[s] = [3, com.fluentgrid.repapp.service.DppService$DppPaymentObserver@ccd000e]\",\n" +
            "            \"logCount\": 910\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"EventsResource:\",\n" +
            "            \"logMessage\": \"REST request to get eventss : 2\",\n" +
            "            \"logCount\": 72\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"NetConnectXmlDocument:\",\n" +
            "            \"logMessage\": \"getXmlDocument called with <?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\"?> <NetConnectRequest xmlns=\\\"http://www.experian.com/NetConnect\\\" xmlns:xsi=\\\"http://www.w3.org/2001/XMLSchema-instance\\\" xsi:schemaLocation=\\\"http://www.experian.com/NetConnect NetConnect.xsd\\\"> <EAI>d</EAI><DBHost>d</DBHost><ReferenceId>1</ReferenceId><Request xmlns=\\\"http://www.experian.com/WebDelivery\\\" version=\\\"1.0\\\"> <Products><ConnectCheck><Subscriber><Preamble>T</Preamble><OpInitials>T</OpInitials><SubCode>5</SubCode></Subscriber><PrimaryApplicant><Name><Surname>H</Surname><First>W</First></Name><SSN>6</SSN><CurrentAddress> <Street>1</Street> <City>H</City> <State>T</State> <Zip>7</Zip> </CurrentAddress> <YOB>1</YOB></PrimaryApplicant><OutputType> <ARF>  <ARFVersion>06</ARFVersion> </ARF></OutputType><Vendor> <VendorNumber>5</VendorNumber> </Vendor><Options> <ReferenceNumber>0</ReferenceNumber><EndUser>s</EndUser> </Options></ConnectCheck> </Products></Request></NetConnectRequest>\",\n" +
            "            \"logCount\": 48\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"WebConfigurer:\",\n" +
            "            \"logMessage\": \"Initializing Metrics registries\",\n" +
            "            \"logCount\": 28\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"EventTypesResource:\",\n" +
            "            \"logMessage\": \"REST request to get all EventTypess\",\n" +
            "            \"logCount\": 27\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"CustomerAccountResource:\",\n" +
            "            \"logMessage\": \"REST request to get CustomerAccount : 2\",\n" +
            "            \"logCount\": 25\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"RepInvoiceResource:\",\n" +
            "            \"logMessage\": \"REST request to get OutstandingAmount : 2\",\n" +
            "            \"logCount\": 25\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"HttpURLConnection:\",\n" +
            "            \"logMessage\": \"sun.net.www.MessageHeader@60b81f145 pairs: {GET /version.jsp?version=3.2.5&m=084772e2-bcd1-4770-897a-2bfeaffbb83b&e=false&l=NULL&p=maven&c=e77989ed21758e78331b20e477fc5582&crsz=A&cssz=A HTTP/1.1: null}{User-Agent: Mozilla/5.0}{Host: versioncheck.hazelcast.com}{Accept: text/html, image/gif, image/jpeg, *; q=.2, */*; q=.2}{Connection: keep-alive}\",\n" +
            "            \"logCount\": 24\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"PaymentResource:\",\n" +
            "            \"logMessage\": \"REST request to get wallet : 2\",\n" +
            "            \"logCount\": 23\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"ContractResource:\",\n" +
            "            \"logMessage\": \"REST request to get Contract By customerAccountId:2\",\n" +
            "            \"logCount\": 23\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"TdspEsiidResource:\",\n" +
            "            \"logMessage\": \"REST request to TdspEsiid : 1008901012126307617100\",\n" +
            "            \"logCount\": 23\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"DatabaseConfiguration:\",\n" +
            "            \"logMessage\": \"Configuring Datasource\",\n" +
            "            \"logCount\": 20\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"AccountReceivableResource:\",\n" +
            "            \"logMessage\": \"REST request to get AccountReceivable : 2\",\n" +
            "            \"logCount\": 17\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"AccountReceivableService:\",\n" +
            "            \"logMessage\": \"registering with payment service\",\n" +
            "            \"logCount\": 12\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"Application:\",\n" +
            "            \"logMessage\": \"Running with Spring Boot v1.1.9.RELEASE, Spring v4.0.8.RELEASE\",\n" +
            "            \"logCount\": 10\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"AsyncConfiguration:\",\n" +
            "            \"logMessage\": \"Creating Async Task Executor\",\n" +
            "            \"logCount\": 10\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"MetricsConfiguration:\",\n" +
            "            \"logMessage\": \"Registering JVM gauges\",\n" +
            "            \"logCount\": 10\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"CacheConfiguration:\",\n" +
            "            \"logMessage\": \"Starting HazelcastCacheManager\",\n" +
            "            \"logCount\": 10\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"UserDetailsService:\",\n" +
            "            \"logMessage\": \"Authenticating admin\",\n" +
            "            \"logCount\": 9\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"DnpRnpService:\",\n" +
            "            \"logMessage\": \"registering with Payment Service\",\n" +
            "            \"logCount\": 8\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"ConnectCheckTransaction:\",\n" +
            "            \"logMessage\": \"ConnectCheckTransaction execute is called with com.fluentgrid.repapp.creditcheck.dto.CreditCheckRequestDTO@13461703\",\n" +
            "            \"logCount\": 8\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"MailConfiguration:\",\n" +
            "            \"logMessage\": \"Configuring mail server\",\n" +
            "            \"logCount\": 7\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"DppService:\",\n" +
            "            \"logMessage\": \"registering with payment service\",\n" +
            "            \"logCount\": 7\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"NetConnectHttpClient:\",\n" +
            "            \"logMessage\": \"getActualURL called with http://www.experian.com/lookupServlet1?lookupServiceName=AccessPoint&lookupServiceVersion=1.0&serviceName=NetConnectDemo&serviceVersion=2.0&responseType=text/plain\",\n" +
            "            \"logCount\": 6\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"ChargeTypesResource:\",\n" +
            "            \"logMessage\": \"REST request to get all ChargeTypess\",\n" +
            "            \"logCount\": 5\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"Http401UnauthorizedEntryPoint:\",\n" +
            "            \"logMessage\": \"Pre-authenticated entry point called. Rejecting access\",\n" +
            "            \"logCount\": 5\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"ContractTypesResource:\",\n" +
            "            \"logMessage\": \"REST request to get all ContractTypes\",\n" +
            "            \"logCount\": 4\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"CreditCheckService:\",\n" +
            "            \"logMessage\": \"getCreditScore called with parameters {0}\",\n" +
            "            \"logCount\": 4\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"NetConnectCreditCheck:\",\n" +
            "            \"logMessage\": \"getCreditScoreOfCustomer called with com.fluentgrid.repapp.creditcheck.dto.CreditCheckRequestDTO@13461703\",\n" +
            "            \"logCount\": 4\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"NetConnectTransaction:\",\n" +
            "            \"logMessage\": \"getConnectCheck transaction\",\n" +
            "            \"logCount\": 4\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"SegmentParser:\",\n" +
            "            \"logMessage\": \"parseSegement111 called with 1110048AC 1XN  YXXXXXXX12HELEN,WILLIE08Approved\",\n" +
            "            \"logCount\": 3\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"PaymentService:\",\n" +
            "            \"logMessage\": \"processpayment called com.fluentgrid.repapp.service.dto.PaymentsDTO@b797c0c\",\n" +
            "            \"logCount\": 3\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"AuthorizePaymentGateway:\",\n" +
            "            \"logMessage\": \"processing payment\",\n" +
            "            \"logCount\": 2\n" +
            "        },\n" +
            "        {\n" +
            "            \"logName\": \"AuthorizeAIMTransaction:\",\n" +
            "            \"logMessage\": \"AIM result\",\n" +
            "            \"logCount\": 1\n" +
            "        }\n" +
            "    ]\n" +
            "}";


}
