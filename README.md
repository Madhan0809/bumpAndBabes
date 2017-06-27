# bumpAndBabes
bdd 
My First Code
public void selectAdminTab(String adminTabs) {

        switch (adminTabs.toUpperCase()) {
            case "BIRTHDAY":
                clickonWeb(theme.get(0))
                break;
            case "GROUPS":
                getGroups().click();
                break;
            case "USERS":
                getUsers().click();
                break;
            case "AUDIT":
                getAudit().click();
                break;
            case "ROLES":
                getRoles().click();
                break;
        }
    }
