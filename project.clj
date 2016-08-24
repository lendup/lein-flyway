(defproject com.lendup/lein-flyway "1.2.0"
  :description "Leiningen Plugin for Database Migration Tool Flyway"
  :url "https://github.com/lendup/lein-flyway"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :eval-in :leiningen

  :aliases {"deploy!" ["do" ["clean"] ["deploy" "lupublish"]]}

  :dependencies [[org.flywaydb/flyway-core "4.0.3"]]

  :plugins [[s3-wagon-private "1.2.0" :exclusions [commons-codec]]]

  :deploy-repositories [["lupublish" {:url "s3p://lendup.repos/maven/releases/"
                                      :username :env/MAVEN_AWS_ACCESS_KEY_ID
                                      :passphrase :env/MAVEN_AWS_SECRET_ACCESS_KEY
                                      :sign-releases false}]]
  :eval-in-leiningen true)
